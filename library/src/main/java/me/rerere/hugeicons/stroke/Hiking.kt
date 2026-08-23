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

val HugeIcons.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = ImageVector.Builder(
            name = "Hiking",
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
            moveTo(19f, 8.5f)
            lineTo(20f, 21.5f)
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
            moveTo(19f, 9.5f)
            curveTo(17.7592f, 9.6551f, 14.8441f, 9.52153f, 12.5112f, 7.89038f)
            curveTo(12.1706f, 7.65224f, 11.7724f, 7.5f, 11.3568f, 7.5f)
            curveTo(10.5558f, 7.5f, 9.85377f, 8.03617f, 9.64299f, 8.80903f)
            lineTo(8.55329f, 12.8046f)
            curveTo(8.51792f, 12.9343f, 8.5f, 13.0681f, 8.5f, 13.2025f)
            curveTo(8.5f, 13.949f, 9.04461f, 14.5838f, 9.78238f, 14.6973f)
            lineTo(13.6856f, 15.2978f)
            curveTo(14.4418f, 15.4141f, 15f, 16.0648f, 15f, 16.8298f)
            curveTo(15f, 16.9429f, 14.9876f, 17.0557f, 14.9631f, 17.1661f)
            lineTo(14f, 21.5f)
            moveTo(12f, 8.49999f)
            lineTo(10.5f, 14f)
            moveTo(9.5f, 13f)
            lineTo(10f, 13.5f)
            lineTo(10.8735f, 8.6957f)
            curveTo(10.927f, 8.40166f, 11.2887f, 8.28867f, 11.5f, 8.5f)
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
            moveTo(5.77044f, 8.00012f)
            lineTo(4.77044f, 12.0001f)
            moveTo(7.27044f, 7.5f)
            lineTo(5.77044f, 13f)
            lineTo(5.29872f, 13f)
            curveTo(4.58146f, 13f, 4f, 12.4186f, 4f, 11.7013f)
            curveTo(4f, 11.5679f, 4.02055f, 11.4353f, 4.06093f, 11.3082f)
            lineTo(4.82751f, 8.89459f)
            curveTo(5.09127f, 8.06413f, 5.86234f, 7.5f, 6.73368f, 7.5f)
            horizontalLineTo(7.27044f)
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
            moveTo(8f, 17f)
            lineTo(6f, 21.5f)
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
            moveTo(12f, 3f)
            verticalLineTo(3.75f)
            moveTo(12f, 5f)
            curveTo(11.3096f, 5f, 10.75f, 4.44035f, 10.75f, 3.75f)
            curveTo(10.75f, 3.05964f, 11.3096f, 2.5f, 12f, 2.5f)
            curveTo(12.6904f, 2.5f, 13.25f, 3.05964f, 13.25f, 3.75f)
            curveTo(13.25f, 4.44035f, 12.6904f, 5f, 12f, 5f)
            close()
        }
        }.build()

        return _hiking!!
    }

private var _hiking: ImageVector? = null
