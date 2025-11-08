package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileYen: ImageVector
    get() {
        if (_fileYen != null) {
            return _fileYen!!
        }
        _fileYen = ImageVector.Builder(
            name = "FileYen",
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
        moveTo(15f, 13f)
        curveTo(15.2f, 13.9167f, 16.08f, 16f, 18f, 17f)
        moveTo(18f, 17f)
        curveTo(19.92f, 16f, 20.8f, 13.9167f, 21f, 13f)
        moveTo(18f, 17f)
        verticalLineTo(22f)
        moveTo(20.5f, 19f)
        horizontalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 22f)
        lineTo(10.7273f, 22f)
        curveTo(7.46607f, 22f, 5.83546f, 22f, 4.70307f, 21.2022f)
        curveTo(4.37862f, 20.9736f, 4.09058f, 20.7025f, 3.8477f, 20.3971f)
        curveTo(3f, 19.3313f, 3f, 17.7966f, 3f, 14.7273f)
        lineTo(3f, 12.1818f)
        curveTo(3f, 9.21865f, 3f, 7.73706f, 3.46894f, 6.55375f)
        curveTo(4.22282f, 4.65142f, 5.81714f, 3.15088f, 7.83836f, 2.44135f)
        curveTo(9.09563f, 2f, 10.6698f, 2f, 13.8182f, 2f)
        curveTo(15.6173f, 2f, 16.5168f, 2f, 17.2352f, 2.2522f)
        curveTo(18.3902f, 2.65765f, 19.3013f, 3.5151f, 19.732f, 4.60214f)
        curveTo(20f, 5.27832f, 20f, 6.12494f, 20f, 7.81818f)
        lineTo(20f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        curveTo(3f, 10.159f, 4.49238f, 8.66667f, 6.33333f, 8.66667f)
        curveTo(6.99912f, 8.66667f, 7.78404f, 8.78333f, 8.43137f, 8.60988f)
        curveTo(9.00652f, 8.45576f, 9.45576f, 8.00652f, 9.60988f, 7.43136f)
        curveTo(9.78333f, 6.78404f, 9.66667f, 5.99912f, 9.66667f, 5.33333f)
        curveTo(9.66667f, 3.49238f, 11.1591f, 2f, 13f, 2f)
        }
        }.build()

        return _fileYen!!
    }

private var _fileYen: ImageVector? = null
