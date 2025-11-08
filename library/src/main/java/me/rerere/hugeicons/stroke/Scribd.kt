package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Scribd: ImageVector
    get() {
        if (_scribd != null) {
            return _scribd!!
        }
        _scribd = ImageVector.Builder(
            name = "Scribd",
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
        moveTo(21.8181f, 16.9135f)
        curveTo(21.529f, 21.3939f, 18.298f, 21.7828f, 17.8843f, 21.9761f)
        curveTo(21.5207f, 16.9135f, 13.4265f, 11.766f, 12.3023f, 11.1653f)
        curveTo(11.1781f, 10.5647f, 9.67557f, 9.86998f, 8.90473f, 9.36339f)
        curveTo(7.62719f, 8.5238f, 7.174f, 7.74514f, 6.83123f, 7.13602f)
        curveTo(6.28163f, 6.15937f, 6.24663f, 3.85251f, 8.70487f, 3.73238f)
        curveTo(11.1631f, 3.61225f, 12.857f, 4.63324f, 12.9692f, 5.26037f)
        curveTo(12.7709f, 6.65093f, 15.4209f, 9.19726f, 17.7283f, 7.33718f)
        curveTo(20.3908f, 5.19091f, 17.9809f, 2.1304f, 16.9247f, 2f)
        curveTo(21.5928f, 2.22844f, 21.8365f, 6.07983f, 21.965f, 8.11072f)
        lineTo(21.9651f, 8.11266f)
        curveTo(21.9651f, 8.11266f, 22.1071f, 12.4331f, 21.8181f, 16.9135f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.89221f, 21.5863f)
        curveTo(6.26017f, 18.7986f, 3.54263f, 17.6062f, 2.34281f, 18.0723f)
        curveTo(2.34281f, 18.0723f, 2f, 16.6741f, 2f, 14.2702f)
        verticalLineTo(10.1f)
        curveTo(2.29361f, 10.9332f, 3.89608f, 13.1929f, 7.9571f, 15.0752f)
        curveTo(12.0181f, 16.9576f, 12.9787f, 18.6656f, 12.9787f, 19.2348f)
        curveTo(13.0383f, 19.7208f, 12.8844f, 20.9048f, 11.737f, 21.9374f)
        curveTo(10.0055f, 22.0232f, 6.33792f, 22.102f, 5.89221f, 21.5863f)
        }
        }.build()

        return _scribd!!
    }

private var _scribd: ImageVector? = null
