package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ActivityCircle: ImageVector
    get() {
        if (_activityCircle != null) {
            return _activityCircle!!
        }
        _activityCircle = ImageVector.Builder(
            name = "ActivityCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 17f)
        lineTo(8.58579f, 12.4142f)
        curveTo(9.25245f, 11.7475f, 9.58579f, 11.4142f, 10f, 11.4142f)
        curveTo(10.4142f, 11.4142f, 10.7475f, 11.7475f, 11.4142f, 12.4142f)
        lineTo(11.5858f, 12.5858f)
        curveTo(12.2525f, 13.2525f, 12.5858f, 13.5858f, 13f, 13.5858f)
        curveTo(13.4142f, 13.5858f, 13.7475f, 13.2525f, 14.4142f, 12.5858f)
        lineTo(20f, 7f)
        }
        }.build()

        return _activityCircle!!
    }

private var _activityCircle: ImageVector? = null
