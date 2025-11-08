package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Beach02: ImageVector
    get() {
        if (_beach02 != null) {
            return _beach02!!
        }
        _beach02 = ImageVector.Builder(
            name = "Beach02",
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
        moveTo(21f, 21f)
        curveTo(18.8012f, 19.7735f, 15.5841f, 19f, 12f, 19f)
        curveTo(8.41592f, 19f, 5.19883f, 19.7735f, 3f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 6.45068f)
        curveTo(7.83333f, 6.11465f, 5f, 6.45068f, 3.5f, 9.48348f)
        moveTo(9.5f, 6.45068f)
        curveTo(10.5f, 6.95471f, 11.5f, 8.47764f, 11.5f, 12f)
        moveTo(9.5f, 6.45068f)
        curveTo(12f, 5.94657f, 15f, 7.47125f, 15f, 11.4968f)
        moveTo(9.5f, 6.45068f)
        curveTo(8.5f, 4.43502f, 6.5f, 2.94235f, 3f, 4.95391f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 6.5f)
        curveTo(8.5f, 8.33333f, 6.5f, 13.5f, 6.5f, 19.5f)
        }
        }.build()

        return _beach02!!
    }

private var _beach02: ImageVector? = null
