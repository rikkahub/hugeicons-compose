package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 12f)
            curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 12.329f)
            horizontalLineTo(6.08839f)
            curveTo(6.48134f, 12.329f, 6.67782f, 12.329f, 6.8471f, 12.2488f)
            curveTo(6.9301f, 12.2095f, 7.0073f, 12.1565f, 7.07611f, 12.0917f)
            curveTo(7.21644f, 11.9595f, 7.30431f, 11.7644f, 7.48005f, 11.3742f)
            curveTo(8.43341f, 9.25756f, 8.91009f, 8.19922f, 9.52719f, 8.03926f)
            curveTo(9.81603f, 7.96439f, 10.119f, 7.9972f, 10.3894f, 8.13262f)
            curveTo(10.967f, 8.42196f, 11.2505f, 9.56261f, 11.8174f, 11.8439f)
            lineTo(12.087f, 12.929f)
            curveTo(12.6981f, 15.3882f, 13.0037f, 16.6179f, 13.627f, 16.8936f)
            curveTo(13.8758f, 17.0036f, 14.1485f, 17.029f, 14.4104f, 16.9665f)
            curveTo(15.0663f, 16.81f, 15.5522f, 15.6541f, 16.524f, 13.3424f)
            curveTo(16.7018f, 12.9196f, 16.7906f, 12.7082f, 16.9402f, 12.567f)
            curveTo(17.0032f, 12.5075f, 17.0732f, 12.458f, 17.1484f, 12.4198f)
            curveTo(17.3269f, 12.329f, 17.537f, 12.329f, 17.9573f, 12.329f)
            horizontalLineTo(22f)
        }
        }.build()

        return _activityCircle!!
    }

private var _activityCircle: ImageVector? = null
