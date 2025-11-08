package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GitPullRequestClosed: ImageVector
    get() {
        if (_gitPullRequestClosed != null) {
            return _gitPullRequestClosed!!
        }
        _gitPullRequestClosed = ImageVector.Builder(
            name = "GitPullRequestClosed",
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
        moveTo(6f, 8f)
        lineTo(6f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11f)
        lineTo(18f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 4f)
        lineTo(18f, 6f)
        moveTo(18f, 6f)
        lineTo(16f, 8f)
        moveTo(18f, 6f)
        lineTo(20f, 8f)
        moveTo(18f, 6f)
        lineTo(16f, 4f)
        }
        }.build()

        return _gitPullRequestClosed!!
    }

private var _gitPullRequestClosed: ImageVector? = null
