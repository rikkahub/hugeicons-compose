package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WebProtection: ImageVector
    get() {
        if (_webProtection != null) {
            return _webProtection!!
        }
        _webProtection = ImageVector.Builder(
            name = "WebProtection",
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
        moveTo(18f, 20.5001f)
        curveTo(18.8888f, 20.3004f, 19.5638f, 19.9723f, 20.1088f, 19.4328f)
        curveTo(21.5f, 18.0554f, 21.5f, 15.8386f, 21.5f, 11.4051f)
        curveTo(21.5f, 6.97151f, 21.5f, 4.75472f, 20.1088f, 3.37739f)
        curveTo(18.7175f, 2.00006f, 16.4783f, 2.00006f, 12f, 2.00006f)
        curveTo(7.52166f, 2.00006f, 5.28249f, 2.00006f, 3.89124f, 3.37739f)
        curveTo(2.5f, 4.75472f, 2.5f, 6.97151f, 2.5f, 11.4051f)
        curveTo(2.5f, 15.8386f, 2.5f, 18.0554f, 3.89124f, 19.4328f)
        curveTo(4.43619f, 19.9723f, 5.11124f, 20.3004f, 6f, 20.5001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 8.50006f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99981f, 5.50006f)
        horizontalLineTo(7.00879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9998f, 5.50006f)
        horizontalLineTo(11.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 17.5001f)
        verticalLineTo(15.0001f)
        curveTo(13.5f, 15.0001f, 12f, 14.0001f, 12f, 14.0001f)
        curveTo(12f, 14.0001f, 10.5f, 15.0001f, 8.5f, 15.0001f)
        verticalLineTo(17.5001f)
        curveTo(8.5f, 21.0001f, 12f, 22.0001f, 12f, 22.0001f)
        curveTo(12f, 22.0001f, 15.5f, 21.0001f, 15.5f, 17.5001f)
        }
        }.build()

        return _webProtection!!
    }

private var _webProtection: ImageVector? = null
