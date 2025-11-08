package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArtificialIntelligence02: ImageVector
    get() {
        if (_artificialIntelligence02 != null) {
            return _artificialIntelligence02!!
        }
        _artificialIntelligence02 = ImageVector.Builder(
            name = "ArtificialIntelligence02",
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
        moveTo(15.5f, 22f)
        verticalLineTo(21.5f)
        curveTo(15.5f, 20.3954f, 16.4321f, 19.5005f, 17.4223f, 19.011f)
        curveTo(18.3846f, 18.5354f, 19.1943f, 17.7511f, 19.2965f, 16.8313f)
        lineTo(19.5f, 15f)
        lineTo(21.5f, 14f)
        lineTo(19f, 10.25f)
        curveTo(19f, 5.69365f, 15.3063f, 2f, 10.75f, 2f)
        curveTo(6.19365f, 2f, 2.5f, 5.69365f, 2.5f, 10.25f)
        curveTo(2.5f, 13.0379f, 3.88283f, 15.5028f, 6f, 16.9962f)
        moveTo(6f, 16.9962f)
        verticalLineTo(22f)
        moveTo(6f, 16.9962f)
        curveTo(6.75065f, 17.5257f, 7.59362f, 17.9331f, 8.5f, 18.1895f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.3077f, 12f)
        lineTo(9.84703f, 7.47891f)
        curveTo(9.7552f, 7.19466f, 9.47344f, 7f, 9.15385f, 7f)
        curveTo(8.83425f, 7f, 8.55249f, 7.19466f, 8.46066f, 7.47891f)
        lineTo(7f, 12f)
        moveTo(14f, 7f)
        verticalLineTo(12f)
        moveTo(7.53846f, 10.5f)
        horizontalLineTo(10.7692f)
        }
        }.build()

        return _artificialIntelligence02!!
    }

private var _artificialIntelligence02: ImageVector? = null
