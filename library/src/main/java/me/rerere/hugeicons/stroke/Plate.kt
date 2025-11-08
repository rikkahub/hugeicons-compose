package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plate: ImageVector
    get() {
        if (_plate != null) {
            return _plate!!
        }
        _plate = ImageVector.Builder(
            name = "Plate",
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
        moveTo(18.4301f, 13f)
        curveTo(18.7891f, 13.5166f, 19f, 14.1471f, 19f, 14.8276f)
        curveTo(19f, 16.5796f, 17.6018f, 18f, 15.8771f, 18f)
        curveTo(15.5726f, 18f, 15.2783f, 17.9557f, 15f, 17.8732f)
        moveTo(18.9805f, 10f)
        curveTo(20.7855f, 11.0188f, 22f, 12.924f, 22f, 15.1063f)
        curveTo(22f, 18.3613f, 19.298f, 21f, 15.9648f, 21f)
        curveTo(14.4472f, 21f, 13.0605f, 20.453f, 12f, 19.5499f)
        }
        }.build()

        return _plate!!
    }

private var _plate: ImageVector? = null
