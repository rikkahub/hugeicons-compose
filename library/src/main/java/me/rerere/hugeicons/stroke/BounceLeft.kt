package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BounceLeft: ImageVector
    get() {
        if (_bounceLeft != null) {
            return _bounceLeft!!
        }
        _bounceLeft = ImageVector.Builder(
            name = "BounceLeft",
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
        moveTo(9f, 10f)
        curveTo(11.1153f, 13.01f, 12.1055f, 17.1528f, 12.752f, 20.086f)
        curveTo(12.8835f, 20.6824f, 12.9492f, 20.9806f, 13.0872f, 20.9991f)
        curveTo(13.2252f, 21.0177f, 13.3662f, 20.7339f, 13.6482f, 20.1662f)
        curveTo(14.9939f, 17.4579f, 17.7827f, 15.062f, 20f, 17.1079f)
        }
        }.build()

        return _bounceLeft!!
    }

private var _bounceLeft: ImageVector? = null
