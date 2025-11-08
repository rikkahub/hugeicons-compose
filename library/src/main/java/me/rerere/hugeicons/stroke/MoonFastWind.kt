package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoonFastWind: ImageVector
    get() {
        if (_moonFastWind != null) {
            return _moonFastWind!!
        }
        _moonFastWind = ImageVector.Builder(
            name = "MoonFastWind",
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
        moveTo(19.5483f, 17f)
        curveTo(20.7476f, 15.9645f, 21.5819f, 14.6272f, 22f, 13.1756f)
        curveTo(19.5473f, 13.4746f, 17.0369f, 12.3432f, 15.7234f, 10.1113f)
        curveTo(14.4099f, 7.87928f, 14.6664f, 5.1807f, 16.1567f, 3.2463f)
        curveTo(14.1701f, 2.75234f, 11.9929f, 2.98823f, 10.0779f, 4.07295f)
        curveTo(7.30713f, 5.64236f, 5.83056f, 8.56635f, 6.0155f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15f)
        curveTo(5.5f, 18.5f, 11.5755f, 17f, 12.7324f, 15f)
        curveTo(12.9026f, 14.7058f, 13f, 14.3643f, 13f, 14f)
        curveTo(13f, 12.8954f, 12.1046f, 12f, 11f, 12f)
        curveTo(9.89543f, 12f, 9f, 12.8954f, 9f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0001f, 20.9146f)
        curveTo(14.1565f, 20.9699f, 14.3248f, 21f, 14.5001f, 21f)
        curveTo(15.3285f, 21f, 16.0001f, 20.3284f, 16.0001f, 19.5f)
        curveTo(16.0001f, 18.6716f, 15.3285f, 18f, 14.5001f, 18f)
        curveTo(14.206f, 18f, 13.9317f, 18.0846f, 13.7002f, 18.2309f)
        curveTo(12.5505f, 19.0225f, 10.4209f, 20.0378f, 8f, 20.301f)
        moveTo(5f, 20.1936f)
        curveTo(4.33025f, 20.0635f, 3.6594f, 19.8541f, 3f, 19.5478f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 20.0003f)
        curveTo(19.2581f, 20.0003f, 19.9557f, 19.8804f, 21f, 19.4551f)
        }
        }.build()

        return _moonFastWind!!
    }

private var _moonFastWind: ImageVector? = null
