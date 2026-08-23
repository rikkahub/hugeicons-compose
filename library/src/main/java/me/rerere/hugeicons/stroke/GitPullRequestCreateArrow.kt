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

val HugeIcons.GitPullRequestCreateArrow: ImageVector
    get() {
        if (_gitPullRequestCreateArrow != null) {
            return _gitPullRequestCreateArrow!!
        }
        _gitPullRequestCreateArrow = ImageVector.Builder(
            name = "GitPullRequestCreateArrow",
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
            moveTo(12f, 6f)
            horizontalLineTo(14f)
            curveTo(15.8692f, 6f, 16.8038f, 6f, 17.5f, 6.40192f)
            curveTo(17.9561f, 6.66523f, 18.3348f, 7.04394f, 18.5981f, 7.5f)
            curveTo(19f, 8.19615f, 19f, 9.13077f, 19f, 11f)
            moveTo(15f, 3f)
            curveTo(15f, 3f, 12f, 5.20944f, 12f, 6f)
            curveTo(12f, 6.79056f, 15f, 9f, 15f, 9f)
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
            moveTo(19f, 15f)
            verticalLineTo(21f)
            moveTo(22f, 18f)
            horizontalLineTo(16f)
        }
        }.build()

        return _gitPullRequestCreateArrow!!
    }

private var _gitPullRequestCreateArrow: ImageVector? = null
