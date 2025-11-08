package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chef: ImageVector
    get() {
        if (_chef != null) {
            return _chef!!
        }
        _chef = ImageVector.Builder(
            name = "Chef",
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
        moveTo(15.3979f, 4.40951f)
        curveTo(15.9703f, 4.02542f, 16.659f, 3.80138f, 17.4f, 3.80138f)
        curveTo(19.3882f, 3.80138f, 21f, 5.4144f, 21f, 7.40415f)
        curveTo(21f, 9.31828f, 19.5084f, 10.8838f, 17.625f, 11f)
        horizontalLineTo(17f)
        moveTo(15.3979f, 4.40951f)
        curveTo(14.9058f, 3.0062f, 13.5703f, 2f, 12f, 2f)
        curveTo(10.4297f, 2f, 9.09418f, 3.0062f, 8.60215f, 4.40951f)
        moveTo(15.3979f, 4.40951f)
        curveTo(15.5288f, 4.78297f, 15.6f, 5.18455f, 15.6f, 5.60277f)
        curveTo(15.6f, 5.91378f, 15.5606f, 6.21558f, 15.4866f, 6.50346f)
        moveTo(9.71838f, 5.60277f)
        curveTo(9.44207f, 5.12473f, 9.05914f, 4.71612f, 8.60215f, 4.40951f)
        moveTo(8.60215f, 4.40951f)
        curveTo(8.02968f, 4.02543f, 7.34099f, 3.80138f, 6.6f, 3.80138f)
        curveTo(4.61177f, 3.80138f, 3f, 5.4144f, 3f, 7.40415f)
        curveTo(3f, 9.31828f, 4.49159f, 10.8838f, 6.375f, 11f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14f)
        verticalLineTo(10f)
        moveTo(7f, 14f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 14.5f)
        curveTo(16.401f, 13.8776f, 14.3005f, 13.5f, 12f, 13.5f)
        curveTo(9.69952f, 13.5f, 7.59905f, 13.8776f, 6f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 17f)
        curveTo(17f, 19.7614f, 14.7614f, 22f, 12f, 22f)
        curveTo(9.23858f, 22f, 7f, 19.7614f, 7f, 17f)
        }
        }.build()

        return _chef!!
    }

private var _chef: ImageVector? = null
