package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bicycle01: ImageVector
    get() {
        if (_bicycle01 != null) {
            return _bicycle01!!
        }
        _bicycle01 = ImageVector.Builder(
            name = "Bicycle01",
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
        moveTo(6f, 20.0026f)
        curveTo(8.20914f, 20.0026f, 10f, 18.2118f, 10f, 16.0026f)
        curveTo(10f, 13.7935f, 8.20914f, 12.0026f, 6f, 12.0026f)
        curveTo(3.79086f, 12.0026f, 2f, 13.7935f, 2f, 16.0026f)
        curveTo(2f, 18.2118f, 3.79086f, 20.0026f, 6f, 20.0026f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 20.0026f)
        curveTo(20.2091f, 20.0026f, 22f, 18.2118f, 22f, 16.0026f)
        curveTo(22f, 13.7935f, 20.2091f, 12.0026f, 18f, 12.0026f)
        curveTo(15.7909f, 12.0026f, 14f, 13.7935f, 14f, 16.0026f)
        curveTo(14f, 18.2118f, 15.7909f, 20.0026f, 18f, 20.0026f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16.0026f)
        horizontalLineTo(10.3706f)
        curveTo(10.7302f, 16.0026f, 11.0622f, 15.8095f, 11.2399f, 15.4968f)
        lineTo(15.5f, 8.00262f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.0026f)
        lineTo(7f, 7.00262f)
        moveTo(7f, 7.00262f)
        horizontalLineTo(5f)
        moveTo(7f, 7.00262f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.0039f, 6.21868f)
        curveTo(19.7999f, 5.64268f, 19.4399f, 4.74268f, 18.2399f, 4.32268f)
        curveTo(17.4599f, 4.02268f, 15.5399f, 3.90268f, 15.2999f, 4.08268f)
        curveTo(14.9527f, 4.16949f, 14.9399f, 4.56268f, 15.1079f, 5.10268f)
        curveTo(15.2444f, 5.68163f, 15.4559f, 6.42824f, 15.6479f, 7.14268f)
        curveTo(16.1399f, 8.97348f, 17.2199f, 12.9387f, 18.0239f, 15.9987f)
        }
        }.build()

        return _bicycle01!!
    }

private var _bicycle01: ImageVector? = null
