package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Award05: ImageVector
    get() {
        if (_award05 != null) {
            return _award05!!
        }
        _award05 = ImageVector.Builder(
            name = "Award05",
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
        moveTo(4.5f, 9.5f)
        curveTo(4.5f, 13.6421f, 7.85786f, 17f, 12f, 17f)
        curveTo(16.1421f, 17f, 19.5f, 13.6421f, 19.5f, 9.5f)
        curveTo(19.5f, 5.35786f, 16.1421f, 2f, 12f, 2f)
        curveTo(7.85786f, 2f, 4.5f, 5.35786f, 4.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10.1667f)
        curveTo(9f, 10.1667f, 9.75f, 10.1667f, 10.5f, 11.5f)
        curveTo(10.5f, 11.5f, 12.8824f, 8.16667f, 15f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8825f, 15f)
        lineTo(17.5527f, 18.2099f)
        curveTo(17.9833f, 20.2723f, 18.1986f, 21.3035f, 17.7563f, 21.7923f)
        curveTo(17.3141f, 22.281f, 16.546f, 21.8606f, 15.0099f, 21.0198f)
        lineTo(12.7364f, 19.7753f)
        curveTo(12.3734f, 19.5766f, 12.1919f, 19.4773f, 12f, 19.4773f)
        curveTo(11.8081f, 19.4773f, 11.6266f, 19.5766f, 11.2636f, 19.7753f)
        lineTo(8.99008f, 21.0198f)
        curveTo(7.45397f, 21.8606f, 6.68592f, 22.281f, 6.24365f, 21.7923f)
        curveTo(5.80139f, 21.3035f, 6.01669f, 20.2723f, 6.44731f, 18.2099f)
        lineTo(7.11752f, 15f)
        }
        }.build()

        return _award05!!
    }

private var _award05: ImageVector? = null
