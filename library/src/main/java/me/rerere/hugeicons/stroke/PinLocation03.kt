package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PinLocation03: ImageVector
    get() {
        if (_pinLocation03 != null) {
            return _pinLocation03!!
        }
        _pinLocation03 = ImageVector.Builder(
            name = "PinLocation03",
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
        moveTo(5f, 16f)
        curveTo(3.7492f, 16.6327f, 3f, 17.4385f, 3f, 18.3158f)
        curveTo(3f, 20.3505f, 7.02944f, 22f, 12f, 22f)
        curveTo(16.9706f, 22f, 21f, 20.3505f, 21f, 18.3158f)
        curveTo(21f, 17.4385f, 20.2508f, 16.6327f, 19f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        lineTo(12f, 18f)
        }
        }.build()

        return _pinLocation03!!
    }

private var _pinLocation03: ImageVector? = null
