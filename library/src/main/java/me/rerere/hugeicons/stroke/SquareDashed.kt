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

val HugeIcons.SquareDashed: ImageVector
    get() {
        if (_squareDashed != null) {
            return _squareDashed!!
        }
        _squareDashed = ImageVector.Builder(
            name = "SquareDashed",
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
            moveTo(6.29219f, 2.75143f)
            curveTo(5.25295f, 2.94471f, 4.4881f, 3.28657f, 3.88343f, 3.89124f)
            curveTo(3.27876f, 4.49591f, 2.93689f, 5.26076f, 2.74361f, 6.3f)
            moveTo(17.6922f, 2.75143f)
            curveTo(18.7314f, 2.94471f, 19.4963f, 3.28657f, 20.1009f, 3.89124f)
            curveTo(20.7056f, 4.49591f, 21.0475f, 5.26076f, 21.2408f, 6.3f)
            moveTo(13.8922f, 2.50495f)
            curveTo(13.3078f, 2.5f, 12.6761f, 2.5f, 11.9922f, 2.5f)
            curveTo(11.3083f, 2.5f, 10.6766f, 2.5f, 10.0922f, 2.50495f)
            moveTo(21.4872f, 10.1f)
            curveTo(21.4922f, 10.6844f, 21.4922f, 11.3161f, 21.4922f, 12f)
            curveTo(21.4922f, 12.6839f, 21.4922f, 13.3156f, 21.4872f, 13.9001f)
            moveTo(2.49714f, 10.1f)
            curveTo(2.49219f, 10.6844f, 2.49219f, 11.3161f, 2.49219f, 12f)
            curveTo(2.49219f, 12.6839f, 2.49219f, 13.3156f, 2.49714f, 13.9001f)
            moveTo(2.74361f, 17.7f)
            curveTo(2.93689f, 18.7392f, 3.27876f, 19.5041f, 3.88343f, 20.1088f)
            curveTo(4.4881f, 20.7134f, 5.25295f, 21.0553f, 6.29219f, 21.2486f)
            moveTo(21.2408f, 17.7f)
            curveTo(21.0475f, 18.7392f, 20.7056f, 19.5041f, 20.1009f, 20.1088f)
            curveTo(19.4963f, 20.7134f, 18.7314f, 21.0553f, 17.6922f, 21.2486f)
            moveTo(13.8922f, 21.495f)
            curveTo(13.3078f, 21.5f, 12.6761f, 21.5f, 11.9922f, 21.5f)
            curveTo(11.3083f, 21.5f, 10.6767f, 21.5f, 10.0923f, 21.495f)
        }
        }.build()

        return _squareDashed!!
    }

private var _squareDashed: ImageVector? = null
