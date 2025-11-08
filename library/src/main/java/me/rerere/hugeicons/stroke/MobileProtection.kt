package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MobileProtection: ImageVector
    get() {
        if (_mobileProtection != null) {
            return _mobileProtection!!
        }
        _mobileProtection = ImageVector.Builder(
            name = "MobileProtection",
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
        moveTo(18f, 13.4974f)
        verticalLineTo(14.9974f)
        curveTo(18f, 18.2972f, 18f, 19.9471f, 16.9749f, 20.9723f)
        curveTo(15.9497f, 21.9974f, 14.2998f, 21.9974f, 11f, 21.9974f)
        curveTo(7.70017f, 21.9974f, 6.05025f, 21.9974f, 5.02513f, 20.9723f)
        curveTo(4f, 19.9471f, 4f, 18.2972f, 4f, 14.9974f)
        verticalLineTo(8.99738f)
        curveTo(4f, 5.69755f, 4f, 4.04763f, 5.02513f, 3.02251f)
        curveTo(5.88151f, 2.16613f, 7.17392f, 2.02516f, 9.5f, 2.00195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5.50195f)
        verticalLineTo(3.00195f)
        curveTo(18f, 3.00195f, 16.5f, 2.00195f, 16.5f, 2.00195f)
        curveTo(16.5f, 2.00195f, 15f, 3.00195f, 13f, 3.00195f)
        verticalLineTo(5.50195f)
        curveTo(13f, 9.00195f, 16.5f, 10.002f, 16.5f, 10.002f)
        curveTo(16.5f, 10.002f, 20f, 9.00195f, 20f, 5.50195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 18.998f)
        horizontalLineTo(12f)
        }
        }.build()

        return _mobileProtection!!
    }

private var _mobileProtection: ImageVector? = null
