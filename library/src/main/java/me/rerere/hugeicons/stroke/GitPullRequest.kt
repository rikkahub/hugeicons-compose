package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) {
            return _gitPullRequest!!
        }
        _gitPullRequest = ImageVector.Builder(
            name = "GitPullRequest",
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
        moveTo(18f, 16f)
        verticalLineTo(12f)
        curveTo(18f, 9.17156f, 18f, 7.75735f, 17.1213f, 6.87867f)
        curveTo(16.2426f, 5.99999f, 14.8284f, 5.99999f, 12f, 5.99999f)
        lineTo(11f, 5.99999f)
        moveTo(11f, 5.99999f)
        curveTo(11f, 5.29976f, 12.9943f, 3.99152f, 13.5f, 3.49999f)
        moveTo(11f, 5.99999f)
        curveTo(11f, 6.70022f, 12.9943f, 8.00846f, 13.5f, 8.49999f)
        }
        }.build()

        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
