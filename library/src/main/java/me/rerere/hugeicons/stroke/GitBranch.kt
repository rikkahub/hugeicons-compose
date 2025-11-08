package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) {
            return _gitBranch!!
        }
        _gitBranch = ImageVector.Builder(
            name = "GitBranch",
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
        moveTo(7f, 19f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 19f, 17.2426f, 19f, 18.1213f, 18.1213f)
        curveTo(19f, 17.2426f, 19f, 15.8284f, 19f, 13f)
        verticalLineTo(10f)
        moveTo(19f, 10f)
        curveTo(19.7002f, 10f, 21.0085f, 11.9943f, 21.5f, 12.5f)
        moveTo(19f, 10f)
        curveTo(18.2998f, 10f, 16.9915f, 11.9943f, 16.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 7f)
        lineTo(5f, 17f)
        }
        }.build()

        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
