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

val HugeIcons.Popsicle: ImageVector
    get() {
        if (_popsicle != null) {
            return _popsicle!!
        }
        _popsicle = ImageVector.Builder(
            name = "Popsicle",
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
            moveTo(15.7807f, 8.89881f)
            lineTo(11.3072f, 4.42529f)
            curveTo(10.3946f, 3.51269f, 9.15685f, 3f, 7.86624f, 3f)
            curveTo(5.17869f, 3f, 3f, 5.17869f, 3f, 7.86625f)
            curveTo(3f, 9.15686f, 3.51269f, 10.3946f, 4.42529f, 11.3072f)
            lineTo(8.89881f, 15.7807f)
            curveTo(10.1652f, 17.0471f, 10.7984f, 17.6803f, 11.539f, 17.8892f)
            curveTo(12.0626f, 18.0369f, 12.6169f, 18.0369f, 13.1405f, 17.8892f)
            curveTo(13.8811f, 17.6803f, 14.5143f, 17.0471f, 15.7807f, 15.7808f)
            curveTo(17.0471f, 14.5144f, 17.6803f, 13.8812f, 17.8892f, 13.1406f)
            curveTo(18.0369f, 12.6169f, 18.0369f, 12.0627f, 17.8892f, 11.539f)
            curveTo(17.6803f, 10.7984f, 17.0471f, 10.1652f, 15.7807f, 8.89881f)
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
            moveTo(16f, 16f)
            lineTo(21f, 21f)
        }
        }.build()

        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
