package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Centralized: ImageVector
    get() {
        if (_centralized != null) {
            return _centralized!!
        }
        _centralized = ImageVector.Builder(
            name = "Centralized",
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
        moveTo(11.9998f, 7f)
        curveTo(9.23833f, 7f, 6.99976f, 9.23857f, 6.99976f, 12f)
        curveTo(6.99976f, 14.7614f, 9.23833f, 17f, 11.9998f, 17f)
        curveTo(14.7612f, 17f, 16.9998f, 14.7614f, 16.9998f, 12f)
        curveTo(16.9998f, 9.23858f, 14.7612f, 7f, 11.9998f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.7364f, 6.26337f)
        lineTo(21.4998f, 2.5f)
        moveTo(17.7364f, 6.26337f)
        curveTo(17.2968f, 5.82377f, 17.5831f, 4.02148f, 17.6964f, 3f)
        moveTo(17.7364f, 6.26337f)
        curveTo(18.176f, 6.70297f, 19.9783f, 6.41666f, 20.9998f, 6.30336f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.26313f, 17.7366f)
        lineTo(2.49976f, 21.5f)
        moveTo(6.26313f, 17.7366f)
        curveTo(5.82353f, 17.297f, 4.02124f, 17.5833f, 2.99976f, 17.6966f)
        moveTo(6.26313f, 17.7366f)
        curveTo(6.70273f, 18.1762f, 6.41642f, 19.9785f, 6.30312f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.7364f, 17.7366f)
        lineTo(21.4998f, 21.5f)
        moveTo(17.7364f, 17.7366f)
        curveTo(18.176f, 17.297f, 19.9783f, 17.5833f, 20.9998f, 17.6966f)
        moveTo(17.7364f, 17.7366f)
        curveTo(17.2968f, 18.1762f, 17.5831f, 19.9785f, 17.6964f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.26313f, 6.26337f)
        lineTo(2.49976f, 2.5f)
        moveTo(6.26313f, 6.26337f)
        curveTo(6.70273f, 5.82377f, 6.41642f, 4.02148f, 6.30312f, 3f)
        moveTo(6.26313f, 6.26337f)
        curveTo(5.82353f, 6.70297f, 4.02124f, 6.41666f, 2.99976f, 6.30336f)
        }
        }.build()

        return _centralized!!
    }

private var _centralized: ImageVector? = null
