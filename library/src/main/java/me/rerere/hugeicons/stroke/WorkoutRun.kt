package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WorkoutRun: ImageVector
    get() {
        if (_workoutRun != null) {
            return _workoutRun!!
        }
        _workoutRun = ImageVector.Builder(
            name = "WorkoutRun",
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
        moveTo(17f, 4.5f)
        curveTo(17f, 5.32843f, 16.3284f, 6f, 15.5f, 6f)
        curveTo(14.6716f, 6f, 14f, 5.32843f, 14f, 4.5f)
        curveTo(14f, 3.67157f, 14.6716f, 3f, 15.5f, 3f)
        curveTo(16.3284f, 3f, 17f, 3.67157f, 17f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 21.0008f)
        lineTo(14.3359f, 18.3848f)
        curveTo(14.1161f, 17.5191f, 13.6615f, 16.7284f, 13.0207f, 16.0974f)
        lineTo(11.5f, 14.5998f)
        moveTo(6f, 11.1534f)
        curveTo(7f, 9.18366f, 8.53767f, 8.0423f, 12f, 8.00136f)
        moveTo(12f, 8.00136f)
        curveTo(12.2186f, 7.99877f, 12.5444f, 7.99799f, 12.8698f, 7.99805f)
        curveTo(13.3747f, 7.99813f, 13.6271f, 7.99818f, 13.8282f, 8.09214f)
        curveTo(14.0293f, 8.18609f, 14.2356f, 8.43256f, 14.6482f, 8.92548f)
        curveTo(14.7664f, 9.06672f, 14.8878f, 9.19326f, 15f, 9.27743f)
        moveTo(12f, 8.00136f)
        lineTo(10.7309f, 9.95956f)
        curveTo(10.0332f, 11.0362f, 9.68429f, 11.5745f, 9.67069f, 12.1397f)
        curveTo(9.66463f, 12.3914f, 9.70617f, 12.642f, 9.79313f, 12.8784f)
        curveTo(9.98834f, 13.409f, 10.4922f, 13.8059f, 11.5f, 14.5998f)
        moveTo(15f, 9.27743f)
        curveTo(16.1547f, 10.1433f, 17.9627f, 10.4921f, 20f, 8.19913f)
        moveTo(15f, 9.27743f)
        lineTo(11.5f, 14.5998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 17.7303f)
        lineTo(4.67822f, 17.8916f)
        curveTo(6.40663f, 18.3028f, 8.20324f, 17.5164f, 9f, 16f)
        }
        }.build()

        return _workoutRun!!
    }

private var _workoutRun: ImageVector? = null
