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

val HugeIcons.AiDrawing: ImageVector
    get() {
        if (_aiDrawing != null) {
            return _aiDrawing!!
        }
        _aiDrawing = ImageVector.Builder(
            name = "AiDrawing",
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
            moveTo(15f, 19f)
            curveTo(18f, 20f, 21f, 19f, 21f, 15f)
            curveTo(21f, 13.1301f, 20.223f, 10.0013f, 18.8485f, 8.15155f)
            moveTo(10f, 3.5f)
            curveTo(12.1766f, 3.5f, 14.129f, 4.17281f, 15.7632f, 5.2368f)
            moveTo(2f, 11f)
            curveTo(2f, 14f, 3f, 21f, 11f, 22f)
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
            moveTo(21.3787f, 5.62132f)
            lineTo(12.5127f, 14.4873f)
            curveTo(11.8883f, 15.1117f, 11.5761f, 15.4239f, 11.201f, 15.6298f)
            curveTo(11.0091f, 15.7351f, 10.8063f, 15.8192f, 10.5961f, 15.8804f)
            curveTo(10.1852f, 16f, 9.74375f, 16f, 8.86076f, 16f)
            curveTo(8.5232f, 16f, 8.35441f, 16f, 8.23158f, 15.9218f)
            curveTo(8.16983f, 15.8825f, 8.11745f, 15.8302f, 8.07816f, 15.7684f)
            curveTo(8f, 15.6456f, 8f, 15.4768f, 8f, 15.1392f)
            curveTo(8f, 14.2563f, 8f, 13.8148f, 8.11962f, 13.4039f)
            curveTo(8.18083f, 13.1937f, 8.26486f, 12.9909f, 8.37021f, 12.799f)
            curveTo(8.57612f, 12.4239f, 8.88831f, 12.1117f, 9.51267f, 11.4873f)
            lineTo(18.3787f, 2.62132f)
            curveTo(18.4136f, 2.58641f, 18.4311f, 2.56894f, 18.4483f, 2.5525f)
            curveTo(18.8084f, 2.2092f, 19.2834f, 2.01242f, 19.7808f, 2.00057f)
            curveTo(19.8046f, 2f, 19.8293f, 2f, 19.8787f, 2f)
            curveTo(19.9913f, 2f, 20.0477f, 2f, 20.0952f, 2.00227f)
            curveTo(21.1249f, 2.05136f, 21.9486f, 2.87506f, 21.9977f, 3.90475f)
            curveTo(22f, 3.95235f, 22f, 4.00867f, 22f, 4.12132f)
            curveTo(22f, 4.1707f, 22f, 4.1954f, 21.9994f, 4.21921f)
            curveTo(21.9876f, 4.71656f, 21.7908f, 5.19164f, 21.4475f, 5.5517f)
            curveTo(21.4311f, 5.56894f, 21.4136f, 5.5864f, 21.3787f, 5.62132f)
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
            moveTo(4.5f, 3.9375f)
            verticalLineTo(5.5f)
            moveTo(4.5f, 5.5f)
            verticalLineTo(7.0625f)
            moveTo(4.5f, 5.5f)
            horizontalLineTo(3.25f)
            moveTo(4.5f, 5.5f)
            horizontalLineTo(5.75f)
            moveTo(7f, 5.5f)
            lineTo(5.91557f, 5.13852f)
            curveTo(5.41789f, 4.97263f, 5.02737f, 4.58211f, 4.86148f, 4.08443f)
            lineTo(4.5f, 3f)
            lineTo(4.13852f, 4.08443f)
            curveTo(3.97263f, 4.58211f, 3.58211f, 4.97263f, 3.08443f, 5.13852f)
            lineTo(2f, 5.5f)
            lineTo(3.08443f, 5.86148f)
            curveTo(3.58211f, 6.02737f, 3.97263f, 6.41789f, 4.13852f, 6.91557f)
            lineTo(4.5f, 8f)
            lineTo(4.86148f, 6.91557f)
            curveTo(5.02737f, 6.41789f, 5.41789f, 6.02737f, 5.91557f, 5.86148f)
            lineTo(7f, 5.5f)
            close()
        }
        }.build()

        return _aiDrawing!!
    }

private var _aiDrawing: ImageVector? = null
