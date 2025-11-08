package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkoutSport: ImageVector
    get() {
        if (_workoutSport != null) {
            return _workoutSport!!
        }
        _workoutSport = ImageVector.Builder(
            name = "WorkoutSport",
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
        moveTo(16f, 4.5f)
        curveTo(16f, 5.32843f, 15.3284f, 6f, 14.5f, 6f)
        curveTo(13.6716f, 6f, 13f, 5.32843f, 13f, 4.5f)
        curveTo(13f, 3.67157f, 13.6716f, 3f, 14.5f, 3f)
        curveTo(15.3284f, 3f, 16f, 3.67157f, 16f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        lineTo(6.47621f, 9.67428f)
        curveTo(6.73692f, 9.26354f, 6.86728f, 9.05817f, 7.03751f, 8.89128f)
        curveTo(7.20774f, 8.72438f, 7.41178f, 8.60193f, 7.81986f, 8.35701f)
        lineTo(8.74159f, 7.8038f)
        curveTo(9.60409f, 7.28615f, 10.0353f, 7.02732f, 10.5122f, 7.00203f)
        curveTo(10.989f, 6.97673f, 11.4429f, 7.18861f, 12.3507f, 7.61236f)
        lineTo(14.0457f, 8.40358f)
        curveTo(14.4189f, 8.57782f, 14.6055f, 8.66493f, 14.7688f, 8.78684f)
        curveTo(14.8846f, 8.87324f, 14.9912f, 8.97234f, 15.087f, 9.08246f)
        curveTo(15.2221f, 9.23784f, 15.3272f, 9.42177f, 15.5373f, 9.78963f)
        curveTo(15.9071f, 10.4369f, 16.092f, 10.7606f, 16.3527f, 10.9886f)
        curveTo(16.5367f, 11.1495f, 16.7467f, 11.2744f, 16.9728f, 11.3573f)
        curveTo(17.2931f, 11.4748f, 17.6524f, 11.4748f, 18.3711f, 11.4748f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 7.5f)
        lineTo(8f, 14f)
        moveTo(8f, 14f)
        lineTo(9.44682f, 16.0256f)
        curveTo(10.0445f, 16.8623f, 9.91027f, 18.016f, 9.13636f, 18.6932f)
        lineTo(6.5f, 21f)
        moveTo(8f, 14f)
        horizontalLineTo(11.5f)
        moveTo(17f, 18f)
        lineTo(14.6f, 14.8f)
        curveTo(14.2223f, 14.2964f, 13.6295f, 14f, 13f, 14f)
        horizontalLineTo(11.5f)
        moveTo(11.5f, 14f)
        lineTo(15f, 9f)
        }
        }.build()

        return _workoutSport!!
    }

private var _workoutSport: ImageVector? = null
