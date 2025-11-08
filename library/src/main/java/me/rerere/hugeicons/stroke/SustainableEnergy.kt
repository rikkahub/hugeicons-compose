package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SustainableEnergy: ImageVector
    get() {
        if (_sustainableEnergy != null) {
            return _sustainableEnergy!!
        }
        _sustainableEnergy = ImageVector.Builder(
            name = "SustainableEnergy",
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
        moveTo(17.2532f, 19.9167f)
        curveTo(19.8129f, 18.2147f, 21.5f, 15.3044f, 21.5f, 12f)
        curveTo(21.5f, 6.75329f, 17.2467f, 2.5f, 12f, 2.5f)
        curveTo(11.2744f, 2.5f, 10.5678f, 2.58134f, 9.88889f, 2.73541f)
        moveTo(17.2532f, 19.9167f)
        verticalLineTo(17f)
        moveTo(17.2532f, 19.9167f)
        horizontalLineTo(20.5f)
        moveTo(6.72222f, 4.09975f)
        curveTo(4.17625f, 5.80396f, 2.5f, 8.70623f, 2.5f, 12f)
        curveTo(2.5f, 17.2467f, 6.75329f, 21.5f, 12f, 21.5f)
        curveTo(12.7256f, 21.5f, 13.4322f, 21.4187f, 14.1111f, 21.2646f)
        moveTo(6.72222f, 4.09975f)
        verticalLineTo(7f)
        moveTo(6.72222f, 4.09975f)
        horizontalLineTo(3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 7f)
        lineTo(9f, 12f)
        horizontalLineTo(15f)
        lineTo(11.5f, 17f)
        }
        }.build()

        return _sustainableEnergy!!
    }

private var _sustainableEnergy: ImageVector? = null
