package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Joker: ImageVector
    get() {
        if (_joker != null) {
            return _joker!!
        }
        _joker = ImageVector.Builder(
            name = "Joker",
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
        moveTo(4f, 7f)
        curveTo(5.10457f, 7f, 6f, 6.10457f, 6f, 5f)
        curveTo(6f, 3.89543f, 5.10457f, 3f, 4f, 3f)
        curveTo(2.89543f, 3f, 2f, 3.89543f, 2f, 5f)
        curveTo(2f, 6.10457f, 2.89543f, 7f, 4f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9f)
        curveTo(21.1046f, 9f, 22f, 8.10457f, 22f, 7f)
        curveTo(22f, 5.89543f, 21.1046f, 5f, 20f, 5f)
        curveTo(18.8954f, 5f, 18f, 5.89543f, 18f, 7f)
        curveTo(18f, 8.10457f, 18.8954f, 9f, 20f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.96694f, 17f)
        curveTo(1.44331f, 11.5f, 8.98977f, 11f, 4.95922f, 7f)
        moveTo(6.37859f, 5f)
        curveTo(7.48264f, 5f, 9.99986f, 6f, 9.99986f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17f)
        curveTo(10.2172f, 18.4523f, 13.3284f, 18.2088f, 19f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 20f)
        curveTo(9.96256f, 21.4523f, 13.5182f, 21.2088f, 20f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0289f, 6.04492f)
        curveTo(15.664f, 6.47929f, 10.2102f, 9.78535f, 11.0499f, 17.2385f)
        moveTo(18.2511f, 8.0892f)
        curveTo(17.0361f, 8.66181f, 15.1252f, 9.88778f, 17.5983f, 12.9129f)
        curveTo(18.3787f, 13.8676f, 19.2858f, 15.88f, 18.951f, 16.8691f)
        }
        }.build()

        return _joker!!
    }

private var _joker: ImageVector? = null
