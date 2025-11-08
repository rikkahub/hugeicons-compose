package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HorizontalResize: ImageVector
    get() {
        if (_horizontalResize != null) {
            return _horizontalResize!!
        }
        _horizontalResize = ImageVector.Builder(
            name = "HorizontalResize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 20f)
        lineTo(10f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 20f)
        lineTo(14f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 12f)
        lineTo(6f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.00017f, 12.0504f)
        curveTo(1.9696f, 11.0147f, 6.00844f, 8.57937f, 6.38885f, 9.06275f)
        curveTo(6.82022f, 9.61089f, 5.78886f, 11.2397f, 5.55656f, 11.7584f)
        curveTo(5.41686f, 12.0703f, 5.42069f, 12.2056f, 5.57954f, 12.5172f)
        curveTo(6.29675f, 13.9241f, 6.65535f, 14.6275f, 6.43595f, 14.9325f)
        lineTo(6.43397f, 14.9352f)
        curveTo(6.08047f, 15.4197f, 2.03001f, 13.0611f, 2.00017f, 12.0504f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9998f, 11.9496f)
        curveTo(22.0304f, 12.9853f, 17.9916f, 15.4206f, 17.6112f, 14.9373f)
        curveTo(17.1798f, 14.3891f, 18.2111f, 12.7602f, 18.4434f, 12.2416f)
        curveTo(18.5831f, 11.9297f, 18.5793f, 11.7944f, 18.4205f, 11.4828f)
        curveTo(17.7033f, 10.0759f, 17.3446f, 9.37251f, 17.564f, 9.06751f)
        lineTo(17.566f, 9.06478f)
        curveTo(17.9195f, 8.58035f, 21.97f, 10.9389f, 21.9998f, 11.9496f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        lineTo(14f, 12f)
        }
        }.build()

        return _horizontalResize!!
    }

private var _horizontalResize: ImageVector? = null
