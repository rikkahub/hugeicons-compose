package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VerticalResize: ImageVector
    get() {
        if (_verticalResize != null) {
            return _verticalResize!!
        }
        _verticalResize = ImageVector.Builder(
            name = "VerticalResize",
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
        moveTo(4f, 10f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9496f, 2.00017f)
        curveTo(12.9853f, 1.9696f, 15.4206f, 6.00844f, 14.9373f, 6.38885f)
        curveTo(14.3891f, 6.82022f, 12.7602f, 5.78886f, 12.2416f, 5.55656f)
        curveTo(11.9297f, 5.41686f, 11.7944f, 5.42069f, 11.4828f, 5.57954f)
        curveTo(10.0759f, 6.29675f, 9.37251f, 6.65535f, 9.06751f, 6.43595f)
        lineTo(9.06478f, 6.43397f)
        curveTo(8.58035f, 6.08047f, 10.9389f, 2.03001f, 11.9496f, 2.00017f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0504f, 21.9998f)
        curveTo(11.0147f, 22.0304f, 8.57937f, 17.9916f, 9.06275f, 17.6112f)
        curveTo(9.61089f, 17.1798f, 11.2397f, 18.2111f, 11.7584f, 18.4434f)
        curveTo(12.0703f, 18.5831f, 12.2056f, 18.5793f, 12.5172f, 18.4205f)
        curveTo(13.9241f, 17.7033f, 14.6275f, 17.3446f, 14.9325f, 17.564f)
        lineTo(14.9352f, 17.566f)
        curveTo(15.4197f, 17.9195f, 13.0611f, 21.97f, 12.0504f, 21.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(14f)
        }
        }.build()

        return _verticalResize!!
    }

private var _verticalResize: ImageVector? = null
