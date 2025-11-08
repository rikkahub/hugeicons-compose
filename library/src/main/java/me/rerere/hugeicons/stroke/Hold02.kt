package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hold02: ImageVector
    get() {
        if (_hold02 != null) {
            return _hold02!!
        }
        _hold02 = ImageVector.Builder(
            name = "Hold02",
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
        moveTo(7.77076f, 11.4992f)
        verticalLineTo(5.99332f)
        curveTo(7.77076f, 5.16776f, 8.43798f, 4.49851f, 9.26103f, 4.49851f)
        curveTo(10.0841f, 4.49851f, 10.7513f, 5.16776f, 10.7513f, 5.99331f)
        verticalLineTo(7.97375f)
        moveTo(7.77076f, 6.88925f)
        lineTo(4.99868f, 9.83609f)
        curveTo(4.08196f, 10.8238f, 3.99762f, 12.3267f, 4.79803f, 13.4114f)
        lineTo(7.93002f, 17.6557f)
        curveTo(8.20528f, 18.0287f, 8.34271f, 18.486f, 8.31879f, 18.9495f)
        verticalLineTo(20f)
        moveTo(10.7465f, 5.87249f)
        lineTo(10.7489f, 5.50475f)
        curveTo(10.7489f, 4.6737f, 11.4205f, 4f, 12.2491f, 4f)
        curveTo(13.0776f, 4f, 13.7492f, 4.6737f, 13.7492f, 5.50475f)
        verticalLineTo(8.37515f)
        moveTo(13.7493f, 6.49884f)
        curveTo(13.7493f, 5.66779f, 14.4209f, 4.99409f, 15.2494f, 4.99409f)
        curveTo(16.078f, 4.99409f, 16.7496f, 5.66779f, 16.7496f, 6.49884f)
        verticalLineTo(8.99541f)
        moveTo(16.7496f, 7.51953f)
        curveTo(16.7496f, 6.68848f, 17.4213f, 6.01478f, 18.2498f, 6.01478f)
        curveTo(19.0783f, 6.01478f, 19.75f, 6.68848f, 19.75f, 7.51953f)
        verticalLineTo(13.5259f)
        curveTo(19.75f, 14.5115f, 19.593f, 16.0996f, 18.4386f, 17.4021f)
        curveTo(18.0233f, 17.8707f, 17.7095f, 18.4439f, 17.7095f, 19.0709f)
        verticalLineTo(20f)
        }
        }.build()

        return _hold02!!
    }

private var _hold02: ImageVector? = null
