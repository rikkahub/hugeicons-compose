package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileEuro: ImageVector
    get() {
        if (_fileEuro != null) {
            return _fileEuro!!
        }
        _fileEuro = ImageVector.Builder(
            name = "FileEuro",
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
        lineTo(20f, 10.5f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 20.4923f)
        curveTo(20.5216f, 21.3957f, 19.6512f, 22f, 18.6568f, 22f)
        curveTo(17.147f, 22f, 15.9231f, 20.6071f, 15.9231f, 18.8889f)
        verticalLineTo(17.1111f)
        curveTo(15.9231f, 15.3929f, 17.147f, 14f, 18.6568f, 14f)
        curveTo(19.6512f, 14f, 20.5216f, 14.6043f, 21f, 15.5077f)
        moveTo(15f, 18f)
        horizontalLineTo(18.9231f)
        }
        }.build()

        return _fileEuro!!
    }

private var _fileEuro: ImageVector? = null
