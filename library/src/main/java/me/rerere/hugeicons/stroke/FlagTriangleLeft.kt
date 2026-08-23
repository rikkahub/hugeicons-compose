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

val HugeIcons.FlagTriangleLeft: ImageVector
    get() {
        if (_flagTriangleLeft != null) {
            return _flagTriangleLeft!!
        }
        _flagTriangleLeft = ImageVector.Builder(
            name = "FlagTriangleLeft",
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
            moveTo(18.25f, 9f)
            verticalLineTo(17.4118f)
            verticalLineTo(22f)
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
            moveTo(9.25927f, 5.43925f)
            lineTo(13.9953f, 3.12627f)
            curveTo(15.9058f, 2.19322f, 16.861f, 1.72669f, 17.5555f, 2.16767f)
            curveTo(18.25f, 2.60865f, 18.25f, 3.68174f, 18.25f, 5.82793f)
            verticalLineTo(15.5484f)
            lineTo(9.18611f, 10.8056f)
            curveTo(6.88701f, 9.60252f, 5.73746f, 9.001f, 5.7501f, 8.07394f)
            curveTo(5.76274f, 7.14688f, 6.92825f, 6.57767f, 9.25927f, 5.43925f)
            close()
        }
        }.build()

        return _flagTriangleLeft!!
    }

private var _flagTriangleLeft: ImageVector? = null
