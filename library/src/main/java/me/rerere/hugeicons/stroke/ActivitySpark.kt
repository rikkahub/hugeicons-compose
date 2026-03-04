package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ActivitySpark: ImageVector
    get() {
        if (_activitySpark != null) {
            return _activitySpark!!
        }
        _activitySpark = ImageVector.Builder(
            name = "ActivitySpark",
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
        moveTo(7f, 14f)
        lineTo(9.79289f, 11.2071f)
        curveTo(10.1834f, 10.8166f, 10.8166f, 10.8166f, 11.2071f, 11.2071f)
        lineTo(12.7929f, 12.7929f)
        curveTo(13.1834f, 13.1834f, 13.8166f, 13.1834f, 14.2071f, 12.7929f)
        lineTo(17f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9993f, 13f)
        curveTo(21f, 12.6804f, 21f, 12.3473f, 21f, 12f)
        curveTo(21f, 7.75736f, 21f, 5.63604f, 19.682f, 4.31802f)
        curveTo(18.364f, 3f, 16.2426f, 3f, 12f, 3f)
        curveTo(7.75736f, 3f, 5.63604f, 3f, 4.31802f, 4.31802f)
        curveTo(3f, 5.63604f, 3f, 7.75736f, 3f, 12f)
        curveTo(3f, 16.2426f, 3f, 18.364f, 4.31802f, 19.682f)
        curveTo(5.63604f, 21f, 7.75736f, 21f, 12f, 21f)
        curveTo(12.3473f, 21f, 12.6804f, 21f, 13f, 20.9993f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9737f, 16.0215f)
        curveTo(18.9795f, 15.9928f, 19.0205f, 15.9928f, 19.0263f, 16.0215f)
        curveTo(19.3302f, 17.5081f, 20.4919f, 18.6698f, 21.9785f, 18.9737f)
        curveTo(22.0072f, 18.9795f, 22.0072f, 19.0205f, 21.9785f, 19.0263f)
        curveTo(20.4919f, 19.3302f, 19.3302f, 20.4919f, 19.0263f, 21.9785f)
        curveTo(19.0205f, 22.0072f, 18.9795f, 22.0072f, 18.9737f, 21.9785f)
        curveTo(18.6698f, 20.4919f, 17.5081f, 19.3302f, 16.0215f, 19.0263f)
        curveTo(15.9928f, 19.0205f, 15.9928f, 18.9795f, 16.0215f, 18.9737f)
        curveTo(17.5081f, 18.6698f, 18.6698f, 17.5081f, 18.9737f, 16.0215f)
        }
        }.build()

        return _activitySpark!!
    }

private var _activitySpark: ImageVector? = null
