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

val HugeIcons.GitPullRequestDraft: ImageVector
    get() {
        if (_gitPullRequestDraft != null) {
            return _gitPullRequestDraft!!
        }
        _gitPullRequestDraft = ImageVector.Builder(
            name = "GitPullRequestDraft",
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
            moveTo(6f, 8f)
            lineTo(6f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 18f)
            arcTo(2f, 2f, 0f, true, false, 4f, 18f)
            arcTo(2f, 2f, 0f, true, false, 8f, 18f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 6f)
            arcTo(2f, 2f, 0f, true, false, 4f, 6f)
            arcTo(2f, 2f, 0f, true, false, 8f, 6f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 18f)
            arcTo(2f, 2f, 0f, true, false, 16f, 18f)
            arcTo(2f, 2f, 0f, true, false, 20f, 18f)
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
            moveTo(18.125f, 11f)
            horizontalLineTo(18f)
            moveTo(18.25f, 11f)
            curveTo(18.25f, 11.1381f, 18.1381f, 11.25f, 18f, 11.25f)
            curveTo(17.8619f, 11.25f, 17.75f, 11.1381f, 17.75f, 11f)
            curveTo(17.75f, 10.8619f, 17.8619f, 10.75f, 18f, 10.75f)
            curveTo(18.1381f, 10.75f, 18.25f, 10.8619f, 18.25f, 11f)
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
            moveTo(18.125f, 6f)
            horizontalLineTo(18f)
            moveTo(18.25f, 6f)
            curveTo(18.25f, 6.13807f, 18.1381f, 6.25f, 18f, 6.25f)
            curveTo(17.8619f, 6.25f, 17.75f, 6.13807f, 17.75f, 6f)
            curveTo(17.75f, 5.86193f, 17.8619f, 5.75f, 18f, 5.75f)
            curveTo(18.1381f, 5.75f, 18.25f, 5.86193f, 18.25f, 6f)
            close()
        }
        }.build()

        return _gitPullRequestDraft!!
    }

private var _gitPullRequestDraft: ImageVector? = null
