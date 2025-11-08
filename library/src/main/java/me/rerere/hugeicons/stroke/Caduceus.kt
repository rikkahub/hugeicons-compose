package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Caduceus: ImageVector
    get() {
        if (_caduceus != null) {
            return _caduceus!!
        }
        _caduceus = ImageVector.Builder(
            name = "Caduceus",
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
        moveTo(13.5f, 3.5f)
        curveTo(13.5f, 4.32843f, 12.8284f, 5f, 12f, 5f)
        curveTo(11.1716f, 5f, 10.5f, 4.32843f, 10.5f, 3.5f)
        curveTo(10.5f, 2.67157f, 11.1716f, 2f, 12f, 2f)
        curveTo(12.8284f, 2f, 13.5f, 2.67157f, 13.5f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 17.5f)
        curveTo(16f, 16.6716f, 14.2091f, 16f, 12f, 16f)
        curveTo(9.79086f, 16f, 8f, 16.6716f, 8f, 17.5f)
        curveTo(8f, 18.3284f, 9.79086f, 19f, 12f, 19f)
        curveTo(13.6569f, 19f, 15f, 19.6716f, 15f, 20.5f)
        curveTo(15f, 21.3284f, 13.6569f, 22f, 12f, 22f)
        curveTo(10.7151f, 22f, 9.61891f, 21.5961f, 9.19145f, 21.0284f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.79608f, 11.949f)
        curveTo(4.78062f, 13.6542f, 2.83394f, 10.7419f, 2f, 8.72618f)
        curveTo(2.88295f, 8.72618f, 4.7205f, 8.1724f, 6.42898f, 6.22663f)
        curveTo(7.175f, 5.377f, 7.54801f, 4.95218f, 7.75824f, 5.00428f)
        curveTo(7.96847f, 5.05638f, 8.25712f, 5.69208f, 8.83442f, 6.9635f)
        curveTo(9.72693f, 8.92909f, 11.0673f, 9.96187f, 12f, 10.3376f)
        curveTo(9.6f, 14.205f, 7.53072f, 13.0233f, 6.79608f, 11.949f)
        moveTo(6.79608f, 11.949f)
        curveTo(7.09111f, 11.6994f, 7.38762f, 11.3509f, 7.68232f, 10.8861f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.2039f, 11.949f)
        curveTo(19.2194f, 13.6542f, 21.1661f, 10.7419f, 22f, 8.72618f)
        curveTo(21.1171f, 8.72618f, 19.2795f, 8.1724f, 17.571f, 6.22663f)
        curveTo(16.825f, 5.377f, 16.452f, 4.95218f, 16.2418f, 5.00428f)
        curveTo(16.0315f, 5.05638f, 15.7429f, 5.69208f, 15.1656f, 6.9635f)
        curveTo(14.2731f, 8.92909f, 12.9327f, 9.96187f, 12f, 10.3376f)
        curveTo(14.4f, 14.205f, 16.4693f, 13.0233f, 17.2039f, 11.949f)
        moveTo(17.2039f, 11.949f)
        curveTo(16.9089f, 11.6994f, 16.6124f, 11.3509f, 16.3177f, 10.8861f)
        }
        }.build()

        return _caduceus!!
    }

private var _caduceus: ImageVector? = null
