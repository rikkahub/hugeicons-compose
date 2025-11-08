package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pumpkin: ImageVector
    get() {
        if (_pumpkin != null) {
            return _pumpkin!!
        }
        _pumpkin = ImageVector.Builder(
            name = "Pumpkin",
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
        moveTo(16f, 18f)
        curveTo(16f, 20f, 14f, 22f, 12f, 22f)
        curveTo(10f, 22f, 8f, 20f, 8f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8f)
        curveTo(14.4012f, 6.8044f, 13.2819f, 6f, 12f, 6f)
        curveTo(10.7181f, 6f, 9.59883f, 6.8044f, 9f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4118f, 19.4077f)
        curveTo(19.6471f, 21.8019f, 22f, 16.4063f, 22f, 12.7038f)
        curveTo(22f, 9.00141f, 19.7754f, 6f, 17.0313f, 6f)
        curveTo(16.0946f, 6f, 14.9412f, 6.47885f, 14f, 7.43654f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.58824f, 19.4077f)
        curveTo(4.35294f, 21.8019f, 2f, 16.4063f, 2f, 12.7038f)
        curveTo(2f, 9.00141f, 4.22456f, 6f, 6.9687f, 6f)
        curveTo(7.90542f, 6f, 9.05882f, 6.47885f, 10f, 7.43654f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        curveTo(12f, 4.66667f, 12.6f, 2f, 15f, 2f)
        }
        }.build()

        return _pumpkin!!
    }

private var _pumpkin: ImageVector? = null
