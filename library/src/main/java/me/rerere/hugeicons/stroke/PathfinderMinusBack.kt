package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PathfinderMinusBack: ImageVector
    get() {
        if (_pathfinderMinusBack != null) {
            return _pathfinderMinusBack!!
        }
        _pathfinderMinusBack = ImageVector.Builder(
            name = "PathfinderMinusBack",
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
        moveTo(15f, 9.00017f)
        curveTo(15.1616f, 9f, 15.3282f, 9f, 15.5f, 9f)
        curveTo(18.3165f, 9f, 19.7247f, 9f, 20.6822f, 9.76359f)
        curveTo(20.8871f, 9.92699f, 21.073f, 10.1129f, 21.2364f, 10.3178f)
        curveTo(22f, 11.2753f, 22f, 12.6835f, 22f, 15.5f)
        curveTo(22f, 18.3165f, 22f, 19.7247f, 21.2364f, 20.6822f)
        curveTo(21.073f, 20.8871f, 20.8871f, 21.073f, 20.6822f, 21.2364f)
        curveTo(19.7247f, 22f, 18.3165f, 22f, 15.5f, 22f)
        curveTo(12.6835f, 22f, 11.2753f, 22f, 10.3178f, 21.2364f)
        curveTo(10.1129f, 21.073f, 9.92699f, 20.8871f, 9.76359f, 20.6822f)
        curveTo(9f, 19.7247f, 9f, 18.3165f, 9f, 15.5f)
        curveTo(9f, 15.3282f, 9f, 15.1616f, 9.00017f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8.99993f)
        curveTo(14.9973f, 11.4866f, 14.9536f, 12.7831f, 14.2366f, 13.6821f)
        curveTo(14.0732f, 13.887f, 13.8873f, 14.0729f, 13.6824f, 14.2363f)
        curveTo(12.7833f, 14.9533f, 11.4868f, 14.9971f, 9.00017f, 14.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9.5f)
        lineTo(2f, 7.5f)
        moveTo(7.5f, 2f)
        lineTo(9.5f, 2f)
        moveTo(2f, 12f)
        curveTo(2.06547f, 12.8804f, 2.22182f, 13.4751f, 2.59527f, 13.9421f)
        curveTo(2.73274f, 14.114f, 2.88914f, 14.27f, 3.06153f, 14.4071f)
        curveTo(3.52821f, 14.7782f, 4.12216f, 14.9343f, 5f, 15f)
        lineTo(5.5f, 15f)
        moveTo(2f, 5f)
        curveTo(2.06568f, 4.12216f, 2.22181f, 3.52821f, 2.59294f, 3.06153f)
        curveTo(2.73003f, 2.88914f, 2.88599f, 2.73274f, 3.0579f, 2.59527f)
        curveTo(3.52488f, 2.22182f, 4.11965f, 2.06546f, 5f, 2f)
        moveTo(12f, 2f)
        curveTo(12.8778f, 2.06568f, 13.4718f, 2.22181f, 13.9385f, 2.59294f)
        curveTo(14.1109f, 2.73003f, 14.2673f, 2.88599f, 14.4047f, 3.0579f)
        curveTo(14.7782f, 3.52488f, 14.9345f, 4.11965f, 15f, 5f)
        lineTo(15f, 5.5f)
        }
        }.build()

        return _pathfinderMinusBack!!
    }

private var _pathfinderMinusBack: ImageVector? = null
