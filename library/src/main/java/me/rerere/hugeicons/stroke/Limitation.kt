package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Limitation: ImageVector
    get() {
        if (_limitation != null) {
            return _limitation!!
        }
        _limitation = ImageVector.Builder(
            name = "Limitation",
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
        moveTo(8f, 20f)
        curveTo(7.48595f, 20.6974f, 7.2774f, 20.9401f, 6.85472f, 20.9929f)
        curveTo(6.43205f, 21.0457f, 6.13982f, 20.8037f, 5.55537f, 20.3197f)
        curveTo(3.38109f, 18.5193f, 2f, 15.8253f, 2f, 12.8147f)
        curveTo(2f, 7.39421f, 6.47715f, 3f, 12f, 3f)
        curveTo(17.5228f, 3f, 22f, 7.39421f, 22f, 12.8147f)
        curveTo(22f, 15.8253f, 20.6189f, 18.5193f, 18.4446f, 20.3197f)
        curveTo(17.8602f, 20.8037f, 17.568f, 21.0457f, 17.1453f, 20.9929f)
        curveTo(16.7226f, 20.9401f, 16.514f, 20.6974f, 16f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 10.5f)
        lineTo(18f, 5f)
        }
        }.build()

        return _limitation!!
    }

private var _limitation: ImageVector? = null
