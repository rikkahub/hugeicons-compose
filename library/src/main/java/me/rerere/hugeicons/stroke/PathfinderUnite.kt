package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PathfinderUnite: ImageVector
    get() {
        if (_pathfinderUnite != null) {
            return _pathfinderUnite!!
        }
        _pathfinderUnite = ImageVector.Builder(
            name = "PathfinderUnite",
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
        moveTo(3.31779f, 14.2364f)
        curveTo(4.2753f, 15f, 5.68353f, 15f, 8.5f, 15f)
        curveTo(8.77614f, 15f, 9f, 15.2239f, 9f, 15.5f)
        curveTo(9f, 18.3165f, 9f, 19.7247f, 9.76359f, 20.6822f)
        curveTo(9.92699f, 20.8871f, 10.1129f, 21.073f, 10.3178f, 21.2364f)
        curveTo(11.2753f, 22f, 12.6835f, 22f, 15.5f, 22f)
        curveTo(18.3165f, 22f, 19.7247f, 22f, 20.6822f, 21.2364f)
        curveTo(20.8871f, 21.073f, 21.073f, 20.8871f, 21.2364f, 20.6822f)
        curveTo(22f, 19.7247f, 22f, 18.3165f, 22f, 15.5f)
        curveTo(22f, 12.6835f, 22f, 11.2753f, 21.2364f, 10.3178f)
        curveTo(21.073f, 10.1129f, 20.8871f, 9.92699f, 20.6822f, 9.76359f)
        curveTo(19.7247f, 9f, 18.3165f, 9f, 15.5f, 9f)
        curveTo(15.2239f, 9f, 15f, 8.77614f, 15f, 8.5f)
        curveTo(15f, 5.68353f, 15f, 4.2753f, 14.2364f, 3.31779f)
        curveTo(14.073f, 3.11289f, 13.8871f, 2.92699f, 13.6822f, 2.76359f)
        curveTo(12.7247f, 2f, 11.3165f, 2f, 8.5f, 2f)
        curveTo(5.68353f, 2f, 4.2753f, 2f, 3.31779f, 2.76359f)
        curveTo(3.11289f, 2.92699f, 2.92699f, 3.11289f, 2.76359f, 3.31779f)
        curveTo(2f, 4.2753f, 2f, 5.68353f, 2f, 8.5f)
        curveTo(2f, 11.3165f, 2f, 12.7247f, 2.76359f, 13.6822f)
        curveTo(2.92699f, 13.8871f, 3.11289f, 14.073f, 3.31779f, 14.2364f)
        }
        }.build()

        return _pathfinderUnite!!
    }

private var _pathfinderUnite: ImageVector? = null
