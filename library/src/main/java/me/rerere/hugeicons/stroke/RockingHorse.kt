package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RockingHorse: ImageVector
    get() {
        if (_rockingHorse != null) {
            return _rockingHorse!!
        }
        _rockingHorse = ImageVector.Builder(
            name = "RockingHorse",
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
        moveTo(2f, 17f)
        curveTo(4.45659f, 19.455f, 8.02658f, 21f, 12f, 21f)
        curveTo(15.9734f, 21f, 19.5434f, 19.455f, 22f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 17.5f)
        lineTo(18.9445f, 15.6852f)
        curveTo(18.0124f, 14.5977f, 17.5f, 13.2127f, 17.5f, 11.7805f)
        verticalLineTo(9f)
        lineTo(18f, 8f)
        lineTo(21f, 9f)
        lineTo(22f, 7.5f)
        lineTo(18.5f, 4.5f)
        verticalLineTo(3f)
        lineTo(17f, 4.5f)
        curveTo(17f, 4.5f, 14.7581f, 5.62096f, 14.1504f, 8.5089f)
        curveTo(13.9798f, 9.31958f, 13.3284f, 10f, 12.5f, 10f)
        horizontalLineTo(10.042f)
        curveTo(8.63807f, 10f, 7.5f, 11.1381f, 7.5f, 12.542f)
        curveTo(7.5f, 13.4948f, 7.23223f, 14.4284f, 6.72724f, 15.2364f)
        lineTo(4.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 10.5f)
        curveTo(8.5f, 10.5f, 7.86936f, 10.2387f, 7.51246f, 9.52492f)
        curveTo(7.15556f, 8.81112f, 6.55638f, 8.5f, 5.8541f, 8.5f)
        curveTo(4.83011f, 8.5f, 4f, 9.33011f, 4f, 10.3541f)
        verticalLineTo(11.5858f)
        curveTo(4f, 12.4913f, 3.64029f, 13.3597f, 3f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 19f)
        lineTo(16.5383f, 16.2306f)
        curveTo(15.5598f, 15.1298f, 14.1573f, 14.5f, 12.6846f, 14.5f)
        curveTo(11.002f, 14.5f, 9.42536f, 15.3209f, 8.4605f, 16.6993f)
        lineTo(6.5f, 19.5f)
        }
        }.build()

        return _rockingHorse!!
    }

private var _rockingHorse: ImageVector? = null
