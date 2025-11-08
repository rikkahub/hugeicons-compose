package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Steak: ImageVector
    get() {
        if (_steak != null) {
            return _steak!!
        }
        _steak = ImageVector.Builder(
            name = "Steak",
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
        moveTo(17f, 16f)
        curveTo(19.7614f, 16f, 22f, 13.7614f, 22f, 11f)
        curveTo(22f, 9.87418f, 21.6279f, 8.83526f, 21f, 7.99951f)
        curveTo(18.8745f, 5.17054f, 16f, 4f, 12f, 4f)
        curveTo(8f, 4f, 2f, 6.86508f, 2f, 10.5f)
        curveTo(2f, 11.8807f, 3.11929f, 13f, 4.5f, 13f)
        horizontalLineTo(8f)
        curveTo(9.32374f, 12.9675f, 12f, 13.5f, 14.2356f, 15.167f)
        curveTo(15.0274f, 15.6933f, 15.9779f, 16f, 17f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10.5f)
        verticalLineTo(11f)
        curveTo(2f, 13.8284f, 2f, 15.2426f, 2.87868f, 16.1213f)
        curveTo(3.75736f, 17f, 5.17157f, 17f, 8f, 17f)
        curveTo(9.32374f, 16.9675f, 12f, 17.5f, 14.2356f, 19.167f)
        curveTo(15.0274f, 19.6933f, 15.9779f, 20f, 17f, 20f)
        curveTo(19.7614f, 20f, 22f, 17.7614f, 22f, 15f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 11f)
        curveTo(18.5f, 11.8284f, 17.8284f, 12.5f, 17f, 12.5f)
        curveTo(16.1716f, 12.5f, 15.5f, 11.8284f, 15.5f, 11f)
        curveTo(15.5f, 10.1716f, 16.1716f, 9.5f, 17f, 9.5f)
        curveTo(17.8284f, 9.5f, 18.5f, 10.1716f, 18.5f, 11f)
        }
        }.build()

        return _steak!!
    }

private var _steak: ImageVector? = null
