package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GraduateMale: ImageVector
    get() {
        if (_graduateMale != null) {
            return _graduateMale!!
        }
        _graduateMale = ImageVector.Builder(
            name = "GraduateMale",
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
        moveTo(19f, 10f)
        curveTo(16.995f, 9.36815f, 14.5882f, 9f, 12f, 9f)
        curveTo(9.41179f, 9f, 7.00499f, 9.36815f, 5f, 10f)
        verticalLineTo(13.5f)
        curveTo(7.00499f, 12.8682f, 9.41179f, 12.5f, 12f, 12.5f)
        curveTo(14.5882f, 12.5f, 16.995f, 12.8682f, 19f, 13.5f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13f)
        verticalLineTo(15.0232f)
        curveTo(19f, 17.1542f, 17.9679f, 19.129f, 16.2812f, 20.2254f)
        lineTo(14.8812f, 21.1354f)
        curveTo(13.1078f, 22.2882f, 10.8922f, 22.2882f, 9.11882f, 21.1354f)
        lineTo(7.71883f, 20.2254f)
        curveTo(6.03208f, 19.129f, 5f, 17.1542f, 5f, 15.0232f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 10f)
        lineTo(20.1257f, 9.4071f)
        curveTo(21.3888f, 8.57875f, 22.0203f, 8.16457f, 21.9995f, 7.57281f)
        curveTo(21.9787f, 6.98105f, 21.32f, 6.62104f, 20.0025f, 5.90101f)
        lineTo(15.2753f, 3.31756f)
        curveTo(13.6681f, 2.43919f, 12.8645f, 2f, 12f, 2f)
        curveTo(11.1355f, 2f, 10.3319f, 2.43919f, 8.72468f, 3.31756f)
        lineTo(3.99753f, 5.90101f)
        curveTo(2.68004f, 6.62104f, 2.02129f, 6.98105f, 2.0005f, 7.57281f)
        curveTo(1.9797f, 8.16457f, 2.61125f, 8.57875f, 3.87434f, 9.4071f)
        lineTo(5f, 10f)
        }
        }.build()

        return _graduateMale!!
    }

private var _graduateMale: ImageVector? = null
