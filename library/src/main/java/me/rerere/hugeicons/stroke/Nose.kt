package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Nose: ImageVector
    get() {
        if (_nose != null) {
            return _nose!!
        }
        _nose = ImageVector.Builder(
            name = "Nose",
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
        moveTo(7f, 17f)
        curveTo(9f, 17f, 9.5f, 21f, 12f, 21f)
        curveTo(14.5f, 21f, 15f, 17f, 17f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 3f)
        curveTo(8.5f, 5.27896f, 7.13238f, 10.0177f, 5.73581f, 12.1124f)
        curveTo(4.16269f, 14.4718f, 2.78009f, 18.3771f, 5.73797f, 19.8041f)
        curveTo(7.19815f, 20.5085f, 9f, 19.0868f, 9f, 19.0868f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 3f)
        curveTo(15.5f, 5.27809f, 16.8676f, 10.0177f, 18.2642f, 12.1124f)
        curveTo(19.8373f, 14.4718f, 21.2199f, 18.3771f, 18.262f, 19.8041f)
        curveTo(16.8018f, 20.5085f, 15f, 19.0868f, 15f, 19.0868f)
        }
        }.build()

        return _nose!!
    }

private var _nose: ImageVector? = null
