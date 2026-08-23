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

val HugeIcons.GitPullRequestArrow: ImageVector
    get() {
        if (_gitPullRequestArrow != null) {
            return _gitPullRequestArrow!!
        }
        _gitPullRequestArrow = ImageVector.Builder(
            name = "GitPullRequestArrow",
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
            moveTo(5f, 9f)
            curveTo(6.65685f, 9f, 8f, 7.65685f, 8f, 6f)
            curveTo(8f, 4.34315f, 6.65685f, 3f, 5f, 3f)
            curveTo(3.34315f, 3f, 2f, 4.34315f, 2f, 6f)
            curveTo(2f, 7.65685f, 3.34315f, 9f, 5f, 9f)
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
            moveTo(5f, 13f)
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
            moveTo(19f, 21f)
            curveTo(20.6569f, 21f, 22f, 19.6569f, 22f, 18f)
            curveTo(22f, 16.3431f, 20.6569f, 15f, 19f, 15f)
            curveTo(17.3431f, 15f, 16f, 16.3431f, 16f, 18f)
            curveTo(16f, 19.6569f, 17.3431f, 21f, 19f, 21f)
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
            moveTo(12f, 6f)
            horizontalLineTo(14f)
            curveTo(15.8692f, 6f, 16.8038f, 6f, 17.5f, 6.40192f)
            curveTo(17.9561f, 6.66523f, 18.3348f, 7.04394f, 18.5981f, 7.5f)
            curveTo(19f, 8.19615f, 19f, 9.13077f, 19f, 11f)
            moveTo(15f, 3f)
            curveTo(15f, 3f, 12f, 5.20944f, 12f, 6f)
            curveTo(12f, 6.79056f, 15f, 9f, 15f, 9f)
        }
        }.build()

        return _gitPullRequestArrow!!
    }

private var _gitPullRequestArrow: ImageVector? = null
