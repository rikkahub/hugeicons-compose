package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Moonset: ImageVector
    get() {
        if (_moonset != null) {
            return _moonset!!
        }
        _moonset = ImageVector.Builder(
            name = "Moonset",
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
        moveTo(17f, 6.5f)
        curveTo(17.4915f, 7.0057f, 18.7998f, 9f, 19.5f, 9f)
        moveTo(22f, 6.5f)
        curveTo(21.5085f, 7.0057f, 20.2002f, 9f, 19.5f, 9f)
        moveTo(19.5f, 9f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.75f, 18f)
        curveTo(17.3235f, 17.1916f, 17.7446f, 16.2813f, 18f, 15.3219f)
        curveTo(15.7006f, 15.6252f, 13.3471f, 14.4775f, 12.1157f, 12.2135f)
        curveTo(10.8843f, 9.94939f, 11.1247f, 7.21203f, 12.5219f, 5.24984f)
        curveTo(10.6594f, 4.74879f, 8.61836f, 4.98806f, 6.823f, 6.08837f)
        curveTo(3.1672f, 8.32888f, 1.91462f, 13.2911f, 4.0253f, 17.1718f)
        curveTo(4.18331f, 17.4623f, 4.35569f, 17.7385f, 4.54094f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        horizontalLineTo(22f)
        }
        }.build()

        return _moonset!!
    }

private var _moonset: ImageVector? = null
