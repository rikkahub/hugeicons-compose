package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Quiz02: ImageVector
    get() {
        if (_quiz02 != null) {
            return _quiz02!!
        }
        _quiz02 = ImageVector.Builder(
            name = "Quiz02",
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
        moveTo(12f, 2f)
        curveTo(7.85786f, 2f, 4.5f, 5.35786f, 4.5f, 9.5f)
        curveTo(4.5f, 11.816f, 5.54973f, 13.8867f, 7.19934f, 15.2625f)
        curveTo(8.19018f, 16.0889f, 9f, 17.2098f, 9f, 18.5f)
        horizontalLineTo(15f)
        curveTo(15f, 17.2098f, 15.8098f, 16.0889f, 16.8007f, 15.2625f)
        curveTo(18.4503f, 13.8867f, 19.5f, 11.816f, 19.5f, 9.5f)
        curveTo(19.5f, 5.35786f, 16.1421f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 18.5f)
        horizontalLineTo(9f)
        verticalLineTo(20.5f)
        curveTo(9f, 21.3284f, 9.67157f, 22f, 10.5f, 22f)
        horizontalLineTo(13.5f)
        curveTo(14.3284f, 22f, 15f, 21.3284f, 15f, 20.5f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        curveTo(10f, 6.98748f, 10.8954f, 6f, 12f, 6f)
        curveTo(13.1046f, 6f, 14f, 6.82081f, 14f, 7.83333f)
        curveTo(14f, 8.19831f, 13.8837f, 8.53837f, 13.6831f, 8.82406f)
        curveTo(13.0854f, 9.67553f, 12f, 10.4875f, 12f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.992f, 14f)
        horizontalLineTo(12.001f)
        }
        }.build()

        return _quiz02!!
    }

private var _quiz02: ImageVector? = null
