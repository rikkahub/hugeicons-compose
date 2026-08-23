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

val HugeIcons.GitBranchPlus: ImageVector
    get() {
        if (_gitBranchPlus != null) {
            return _gitBranchPlus!!
        }
        _gitBranchPlus = ImageVector.Builder(
            name = "GitBranchPlus",
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
            moveTo(18f, 15f)
            verticalLineTo(21f)
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
            moveTo(21f, 18f)
            horizontalLineTo(15f)
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
            moveTo(18f, 9f)
            curveTo(19.6569f, 9f, 21f, 7.65685f, 21f, 6f)
            curveTo(21f, 4.34315f, 19.6569f, 3f, 18f, 3f)
            curveTo(16.3431f, 3f, 15f, 4.34315f, 15f, 6f)
            curveTo(15f, 7.65685f, 16.3431f, 9f, 18f, 9f)
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
            moveTo(6f, 9f)
            curveTo(7.65685f, 9f, 9f, 7.65685f, 9f, 6f)
            curveTo(9f, 4.34315f, 7.65685f, 3f, 6f, 3f)
            curveTo(4.34315f, 3f, 3f, 4.34315f, 3f, 6f)
            curveTo(3f, 7.65685f, 4.34315f, 9f, 6f, 9f)
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
            moveTo(6f, 21f)
            curveTo(7.65685f, 21f, 9f, 19.6569f, 9f, 18f)
            curveTo(9f, 16.3431f, 7.65685f, 15f, 6f, 15f)
            curveTo(4.34315f, 15f, 3f, 16.3431f, 3f, 18f)
            curveTo(3f, 19.6569f, 4.34315f, 21f, 6f, 21f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 15f)
            verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 9f)
            curveTo(18f, 10.6569f, 16.6569f, 12f, 15f, 12f)
            horizontalLineTo(9f)
            curveTo(7.34315f, 12f, 6f, 13.3431f, 6f, 15f)
        }
        }.build()

        return _gitBranchPlus!!
    }

private var _gitBranchPlus: ImageVector? = null
