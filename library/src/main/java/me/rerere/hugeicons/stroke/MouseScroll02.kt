package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MouseScroll02: ImageVector
    get() {
        if (_mouseScroll02 != null) {
            return _mouseScroll02!!
        }
        _mouseScroll02 = ImageVector.Builder(
            name = "MouseScroll02",
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
        moveTo(12f, 22f)
        curveTo(18f, 22f, 19.5f, 17.49f, 19.5f, 12f)
        curveTo(19.5f, 6.50998f, 18f, 2f, 12f, 2f)
        curveTo(5.99993f, 2f, 4.5f, 6.50996f, 4.5f, 12f)
        curveTo(4.5f, 17.49f, 5.99993f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9883f, 6.83859f)
        lineTo(11.9883f, 11.7586f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.99609f, 7.8586f)
        curveTo(10.9801f, 6.8386f, 11.5801f, 5.9386f, 12.0361f, 6.00329f)
        curveTo(12.4201f, 6.0001f, 12.7801f, 6.5986f, 14.0041f, 7.8586f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0041f, 11.1406f)
        curveTo(13.0201f, 12.1606f, 12.4201f, 13.0606f, 11.9641f, 12.9959f)
        curveTo(11.5801f, 12.9991f, 11.2201f, 12.4006f, 9.99609f, 11.1406f)
        }
        }.build()

        return _mouseScroll02!!
    }

private var _mouseScroll02: ImageVector? = null
