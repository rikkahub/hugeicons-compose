package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkoutSquats: ImageVector
    get() {
        if (_workoutSquats != null) {
            return _workoutSquats!!
        }
        _workoutSquats = ImageVector.Builder(
            name = "WorkoutSquats",
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
        moveTo(13f, 4.5f)
        curveTo(13f, 5.32843f, 12.3284f, 6f, 11.5f, 6f)
        curveTo(10.6716f, 6f, 10f, 5.32843f, 10f, 4.5f)
        curveTo(10f, 3.67157f, 10.6716f, 3f, 11.5f, 3f)
        curveTo(12.3284f, 3f, 13f, 3.67157f, 13f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9477f, 21f)
        lineTo(12.0786f, 17.5908f)
        curveTo(12.482f, 16.3747f, 12.6837f, 15.7667f, 12.3821f, 15.3462f)
        curveTo(12.0806f, 14.9258f, 11.4427f, 14.9258f, 10.167f, 14.9258f)
        horizontalLineTo(8.9329f)
        moveTo(18f, 8.34546f)
        lineTo(16.2639f, 9.34233f)
        curveTo(15.3862f, 9.84631f, 14.9473f, 10.0983f, 14.4623f, 10.1209f)
        curveTo(13.9774f, 10.1434f, 13.5172f, 9.93325f, 12.5969f, 9.5129f)
        lineTo(11.8137f, 9.15516f)
        moveTo(8.9329f, 14.9258f)
        horizontalLineTo(7.92524f)
        curveTo(6.97669f, 14.9258f, 6.50242f, 14.9258f, 6.20005f, 14.5526f)
        curveTo(5.89768f, 14.1794f, 5.98421f, 13.7596f, 6.15728f, 12.9201f)
        curveTo(6.44708f, 11.5144f, 7.02913f, 9.76698f, 8.09216f, 8.57871f)
        curveTo(8.38558f, 8.25073f, 8.53228f, 8.08674f, 8.85504f, 8.01898f)
        curveTo(9.17781f, 7.95122f, 9.43598f, 8.06914f, 9.95232f, 8.30498f)
        lineTo(11.8137f, 9.15516f)
        moveTo(8.9329f, 14.9258f)
        curveTo(9.1743f, 13.6098f, 10.0884f, 10.6132f, 11.8137f, 9.15516f)
        }
        }.build()

        return _workoutSquats!!
    }

private var _workoutSquats: ImageVector? = null
