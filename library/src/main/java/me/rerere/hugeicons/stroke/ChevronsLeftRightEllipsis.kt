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

val HugeIcons.ChevronsLeftRightEllipsis: ImageVector
    get() {
        if (_chevronsLeftRightEllipsis != null) {
            return _chevronsLeftRightEllipsis!!
        }
        _chevronsLeftRightEllipsis = ImageVector.Builder(
            name = "ChevronsLeftRightEllipsis",
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
            moveTo(14.5f, 11.875f)
            verticalLineTo(12f)
            moveTo(14.75f, 12f)
            curveTo(14.75f, 12.1381f, 14.6381f, 12.25f, 14.5f, 12.25f)
            curveTo(14.3619f, 12.25f, 14.25f, 12.1381f, 14.25f, 12f)
            curveTo(14.25f, 11.8619f, 14.3619f, 11.75f, 14.5f, 11.75f)
            curveTo(14.6381f, 11.75f, 14.75f, 11.8619f, 14.75f, 12f)
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
            moveTo(9.5f, 11.875f)
            verticalLineTo(12f)
            moveTo(9.75f, 12f)
            curveTo(9.75f, 12.1381f, 9.63807f, 12.25f, 9.5f, 12.25f)
            curveTo(9.36193f, 12.25f, 9.25f, 12.1381f, 9.25f, 12f)
            curveTo(9.25f, 11.8619f, 9.36193f, 11.75f, 9.5f, 11.75f)
            curveTo(9.63807f, 11.75f, 9.75f, 11.8619f, 9.75f, 12f)
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
            moveTo(6.99996f, 17f)
            curveTo(6.99996f, 17f, 2.00001f, 13.3176f, 2f, 12f)
            curveTo(1.99999f, 10.6824f, 7f, 7f, 7f, 7f)
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
            moveTo(17f, 17f)
            curveTo(17f, 17f, 22f, 13.3176f, 22f, 12f)
            curveTo(22f, 10.6824f, 17f, 7f, 17f, 7f)
        }
        }.build()

        return _chevronsLeftRightEllipsis!!
    }

private var _chevronsLeftRightEllipsis: ImageVector? = null
