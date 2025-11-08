package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Download01: ImageVector
    get() {
        if (_download01 != null) {
            return _download01!!
        }
        _download01 = ImageVector.Builder(
            name = "Download01",
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
        moveTo(2.99969f, 17.0002f)
        curveTo(2.99969f, 17.9302f, 2.99969f, 18.3952f, 3.10192f, 18.7767f)
        curveTo(3.37932f, 19.8119f, 4.18796f, 20.6206f, 5.22324f, 20.898f)
        curveTo(5.60474f, 21.0002f, 6.06972f, 21.0002f, 6.99969f, 21.0002f)
        lineTo(16.9997f, 21.0002f)
        curveTo(17.9297f, 21.0002f, 18.3947f, 21.0002f, 18.7762f, 20.898f)
        curveTo(19.8114f, 20.6206f, 20.6201f, 19.8119f, 20.8975f, 18.7767f)
        curveTo(20.9997f, 18.3952f, 20.9997f, 17.9302f, 20.9997f, 17.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.4998f, 11.5002f)
        curveTo(16.4998f, 11.5002f, 13.1856f, 16.0002f, 11.9997f, 16.0002f)
        curveTo(10.8139f, 16.0002f, 7.49976f, 11.5002f, 7.49976f, 11.5002f)
        moveTo(11.9997f, 15.0002f)
        verticalLineTo(3.00016f)
        }
        }.build()

        return _download01!!
    }

private var _download01: ImageVector? = null
