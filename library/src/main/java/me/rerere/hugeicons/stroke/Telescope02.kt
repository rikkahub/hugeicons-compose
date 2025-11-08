package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Telescope02: ImageVector
    get() {
        if (_telescope02 != null) {
            return _telescope02!!
        }
        _telescope02 = ImageVector.Builder(
            name = "Telescope02",
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
        moveTo(19f, 22f)
        lineTo(14f, 13f)
        lineTo(9f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9196f, 4f)
        lineTo(7.02715f, 9.2559f)
        curveTo(6.04492f, 9.83645f, 5.70838f, 11.1222f, 6.27548f, 12.1278f)
        lineTo(7.30228f, 13.9485f)
        curveTo(7.86937f, 14.954f, 9.12535f, 15.2985f, 10.1076f, 14.718f)
        lineTo(19f, 9.46209f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.2195f, 4.45572f)
        curveTo(15.7677f, 3.67278f, 16.0358f, 2.67162f, 16.8184f, 2.21959f)
        curveTo(17.601f, 1.76755f, 18.6017f, 2.03581f, 19.0535f, 2.81876f)
        lineTo(21.7805f, 7.54428f)
        curveTo(22.2323f, 8.32723f, 21.9642f, 9.32838f, 21.1816f, 9.78042f)
        curveTo(20.399f, 10.2325f, 19.3983f, 9.96419f, 18.9465f, 9.18124f)
        lineTo(16.2195f, 4.45572f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14.2645f)
        lineTo(2.73817f, 15.6322f)
        moveTo(2.73817f, 15.6322f)
        lineTo(3.47634f, 17f)
        moveTo(2.73817f, 15.6322f)
        lineTo(6.5f, 13.5f)
        }
        }.build()

        return _telescope02!!
    }

private var _telescope02: ImageVector? = null
