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

val HugeIcons.SiriNew: ImageVector
    get() {
        if (_siriNew != null) {
            return _siriNew!!
        }
        _siriNew = ImageVector.Builder(
            name = "SiriNew",
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
            moveTo(11.7805f, 14f)
            curveTo(10.4461f, 15.3922f, 8.56592f, 17f, 7f, 17f)
            curveTo(4.23858f, 17f, 2f, 14.7614f, 2f, 12f)
            curveTo(2f, 9.23858f, 4.23858f, 7f, 7f, 7f)
            curveTo(12.0899f, 7f, 13.5399f, 15.5f, 18.5217f, 15.5f)
            curveTo(20.4427f, 15.5f, 22f, 13.933f, 22f, 12f)
            curveTo(22f, 10.067f, 20.4427f, 8.5f, 18.5217f, 8.5f)
            curveTo(17.6263f, 8.5f, 16.4746f, 9.26045f, 15.5f, 10.0724f)
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }
        }.build()

        return _siriNew!!
    }

private var _siriNew: ImageVector? = null
