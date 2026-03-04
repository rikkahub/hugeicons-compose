package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDownBig: ImageVector
    get() {
        if (_arrowDownBig != null) {
            return _arrowDownBig!!
        }
        _arrowDownBig = ImageVector.Builder(
            name = "ArrowDownBig",
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
        moveTo(15.544f, 12.4999f)
        horizontalLineTo(15f)
        verticalLineTo(6.49991f)
        curveTo(15f, 5.56803f, 15f, 5.10208f, 14.8478f, 4.73454f)
        curveTo(14.6448f, 4.24449f, 14.2554f, 3.85514f, 13.7654f, 3.65215f)
        curveTo(13.3978f, 3.49991f, 12.9319f, 3.49991f, 12f, 3.49991f)
        curveTo(11.0681f, 3.49991f, 10.6022f, 3.49991f, 10.2346f, 3.65215f)
        curveTo(9.74458f, 3.85514f, 9.35523f, 4.24449f, 9.15224f, 4.73454f)
        curveTo(9f, 5.10208f, 9f, 5.56803f, 9f, 6.49991f)
        verticalLineTo(12.4999f)
        horizontalLineTo(8.45596f)
        curveTo(6.37322f, 12.4999f, 5.33185f, 12.4999f, 5.05779f, 13.1002f)
        curveTo(4.78372f, 13.7005f, 5.49744f, 14.4182f, 6.92487f, 15.8535f)
        lineTo(10.4689f, 19.4171f)
        curveTo(11.1868f, 20.139f, 11.5458f, 20.4999f, 12f, 20.4999f)
        curveTo(12.4542f, 20.4999f, 12.8132f, 20.139f, 13.5311f, 19.4171f)
        lineTo(17.0751f, 15.8535f)
        curveTo(18.5026f, 14.4182f, 19.2163f, 13.7005f, 18.9422f, 13.1002f)
        curveTo(18.6681f, 12.4999f, 17.6268f, 12.4999f, 15.544f, 12.4999f)
        }
        }.build()

        return _arrowDownBig!!
    }

private var _arrowDownBig: ImageVector? = null
